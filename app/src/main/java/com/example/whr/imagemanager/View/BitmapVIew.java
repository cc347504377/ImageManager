package com.example.whr.imagemanager.View;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.example.whr.imagemanager.R;

/**
 * Created by whr on 16-12-20.
 */

public class BitmapVIew extends View {

    private final Bitmap bmp;
    private final Matrix matrix;
    private Bitmap dstbmp;
    private final Paint paint;

    public BitmapVIew(Context context) {
        super(context);
        paint = new Paint();


        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inSampleSize = 5;   //width，hight设为原来的五分一
        // 获取资源文件的引用res
        Resources res = getResources();
        // 获取图形资源文件
        bmp = BitmapFactory.decodeResource(res, R.drawable.a,options);
        // 设置canvas画布背景为白色
        matrix = new Matrix();
        // 缩放原图
        matrix.postScale(1f, 1f);
        // 向左旋转45度，参数为正则向右旋转

    }
    //重写onDraw方法
    public void onDraw(Canvas canvas)
    {
        //设置画布边背景色为黑色
        canvas.drawColor(Color.BLACK);
        // 在画布上绘制旋转后的位图
        //放在坐标为默认的位置
        canvas.drawBitmap(bmp,matrix,paint);


//放在0,200位置
//        Bitmap.createBitmap(bmp, 0, 0, bmp.getWidth(), bmp.getHeight(), matrix, false);
//        canvas.drawBitmap(dstbmp, 0, 200, null);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (MotionEvent.ACTION_DOWN == event.getAction()) {
            Log.i("TAG", "Down");
            matrix.postRotate(-45, bmp.getWidth() / 2, bmp.getHeight() / 2);
//            缩小到原来的一半
//            matrix.postScale(0.5f, 0.5f);
            invalidate();
        }
        return true;
    }
}
