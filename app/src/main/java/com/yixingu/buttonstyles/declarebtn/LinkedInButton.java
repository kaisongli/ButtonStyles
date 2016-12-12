package com.yixingu.buttonstyles.declarebtn;

import android.content.Context;
import android.util.AttributeSet;

import com.yixingu.buttonstyles.R;

/**
 * Created by likaisong on 16-12-11.
 */
public class LinkedInButton extends BaseButton {

    public LinkedInButton(Context context, AttributeSet attrs) {
        super(context,attrs, R.color.linkedin,R.drawable.linkedin_logo);
    }

    public LinkedInButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs,defStyle,R.color.linkedin,R.drawable.linkedin_logo);
    }

    public LinkedInButton(Context context) {
        super(context);
    }

}
