package com.pehls.healthcare.View.Profile;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.pehls.healthcare.R;

/**
 * Created by gabri on 11/11/2017.
 */

public class ProfileAdapter {
    static void ProfileAdapter (){}

    public static Button getOk_button(View view) {
        return (Button) view.findViewById(R.id.ok_button);
    }

    public static TextView getName_textView(View view) {
        return (TextView) view.findViewById(R.id.name_textView);
    }
}
