package com.yixingu.buttonstyles.declarebtn;

import android.content.Context;
import android.util.AttributeSet;

import com.yixingu.buttonstyles.R;

/**
 * Created by likaisong on 16-12-11.
 */
public class TwitterButton extends BaseButton {

    public TwitterButton(Context context, AttributeSet attrs) {
        super(context,attrs, R.color.twitter,R.drawable.twitter_logo);
    }

    public TwitterButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs,defStyle,R.color.twitter,R.drawable.twitter_logo);
    }

    public TwitterButton(Context context) {
        super(context);
    }

}
