package com.yixingu.buttonstyles.declarebtn;

import android.content.Context;
import android.util.AttributeSet;

import com.yixingu.buttonstyles.R;

/**
 * Created by likaisong on 16-12-11.
 */
public class GooglePlusButton extends BaseButton {


    public GooglePlusButton(Context context, AttributeSet attrs) {
        super(context,attrs, R.color.google,R.drawable.google_logo);

    }

    public GooglePlusButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs,defStyle,R.color.google,R.drawable.google_logo);

    }

    public GooglePlusButton(Context context) {
        super(context);
    }


}
