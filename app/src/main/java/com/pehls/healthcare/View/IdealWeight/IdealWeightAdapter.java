package com.pehls.healthcare.View.IdealWeight;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.pehls.healthcare.R;

/**
 * Created by gabri on 14/11/2017.
 */

public class IdealWeightAdapter {
    private static TextView height_textView;
    private static Button ok_button2;
    private static View view;
    static void IdealWeightAdapter (View view) {
        height_textView = (TextView) view.findViewById(R.id.height_textView);
        ok_button2 = (Button) view.findViewById(R.id.ok_button2);
    }

    public static Button getOk_button2() {
        return ok_button2;
    }

    public static TextView getHeight_textView() {
        return height_textView;
    }
}
