package com.pehls.healthcare.View.IMC;

import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.widget.Button;
import android.widget.TextView;

import com.pehls.healthcare.R;

/**
 * Created by gabri on 27/11/2017.
 */

public class IMCActivityTest extends ActivityUnitTestCase<IMCActivity>{
    public IMCActivityTest() {
        super(IMCActivity.class);
    }
    private IMCActivity activity;

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        Intent intent = new Intent(getInstrumentation().getTargetContext(), IMCActivity.class);
        startActivity(intent, null, null);

        activity = getActivity();
    }

    public void testDevePossuirBotaoOk() throws Exception {
        Button ok_btn = (Button) activity.findViewById(R.id.ok_button3);

        assertNotNull(ok_btn);
    }

    public void testDevePossuirTextView() throws Exception {
        TextView textView = (TextView) activity.findViewById(R.id.imc_textView);

        assertNotNull(textView);
    }
}
