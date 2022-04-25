package com.example.kotlindemo.view

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView
import com.example.kotlindemo.R

/**
 * name：zjj
 * date：2022/4/25
 * desc：类备注
 */
class CameraImageView : AppCompatImageView {

    private lateinit var mBitmap: Bitmap

    private lateinit var mPaint: Paint

    private var mProgress: Int = 0

    private val mCamera = Camera()

    private var mMatrix = Matrix()

    constructor(context: Context) : this(context, null)

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init()
    }

    private fun init() {
        mBitmap = BitmapFactory.decodeResource(resources, R.mipmap.test)
        mPaint = Paint()
        mPaint.isAntiAlias = true
    }

    fun setProgress(progress: Int) {
        mProgress = progress
        postInvalidate()
    }

    override fun onDraw(canvas: Canvas?) {
        mCamera.save()
        canvas?.save()

        mPaint.alpha = 100
        canvas?.drawBitmap(mBitmap, 0f, 0f, mPaint)
        mCamera.rotateY(mProgress.toFloat())
        mCamera.applyToCanvas(canvas)
        mCamera.restore()

        super.onDraw(canvas)
        canvas?.restore()
    }

}