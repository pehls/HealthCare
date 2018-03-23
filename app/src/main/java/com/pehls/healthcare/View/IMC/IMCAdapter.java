package com.pehls.healthcare.View.IMC;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.pehls.healthcare.R;

/**
 * Created by gabri on 14/11/2017.
 */

public class IMCAdapter {
    private static TextView imc_textView;
    private static Button ok_button;
    static void IMCAdapter (View view) {
        imc_textView = (TextView) view.findViewById(R.id.imc_textView);
        ok_button = (Button) view.findViewById(R.id.ok_button3);
    }

    public static Button getOk_button() {
        return ok_button;
    }

    public static TextView getImc_textView() {
        return imc_textView;
    }
}
