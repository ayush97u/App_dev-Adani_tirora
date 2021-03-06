package bits.emd.adani.SwitchYard.dm_transformer_yard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ToggleButton;

import java.text.SimpleDateFormat;

import bits.emd.adani.SwitchYard.ConnectionClass;
import bits.emd.adani.SwitchYard.R;

public class dm_transformer_yard_st extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dm_transformer_yard_st);

        // Submit, Edit & Final Button Declaration
        final Button submit_btn = (Button)findViewById(R.id.dm_765kv_st_submit_btn);
        final Button edit_btn = (Button)findViewById(R.id.dm_765kv_st_edit_btn);
        final Button confirm_btn = (Button)findViewById(R.id.dm_765kv_st_confirm_btn);

        // SubmitButton OnClick
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.GONE);
                edit_btn.setVisibility(View.VISIBLE);
                confirm_btn.setVisibility(View.VISIBLE);

                RadioGroup rg = (RadioGroup)findViewById(R.id.dm_765KV_st_radiogroup); //To ensure Radiobuttons are unclickable
                for(int i=0;i<rg.getChildCount();i++)
                {
                    rg.getChildAt(i).setClickable(false);
                }

                EditText ed =(EditText)findViewById(R.id.DM_765KV_ST_hv_wti); // HV WTI editText
                ed.setEnabled(false);
                ed =(EditText)findViewById(R.id.DM_765KV_ST_lv1_wti); // LV1 WTI editText
                ed.setEnabled(false);
                ed =(EditText)findViewById(R.id.DM_765KV_ST_lv2_wti); // LV2 WTI editText
                ed.setEnabled(false);
                ed =(EditText)findViewById(R.id.DM_765KV_ST_oti); // OTI editText
                ed.setEnabled(false);
                ed =(EditText)findViewById(R.id.DM_765KV_ST_oil_level); // Oil Level in Main Tank editText
                ed.setEnabled(false);
                ed =(EditText)findViewById(R.id.DM_765KV_ST_oil_level_oltc); //Oil Level in OLTC editText
                ed.setEnabled(false);


                ToggleButton tb = (ToggleButton)findViewById(R.id.DM_765_KV_PERSISTING_TRAFO_ALARMS); // Peresisiting TRAFO Alarms
                tb.setClickable(false);
                tb = (ToggleButton)findViewById(R.id.DM_765KV_ST_oil_leakage); // Oil Leakage
                tb.setClickable(false);
                tb = (ToggleButton)findViewById(R.id.DM_765KV_ST_fan_status); // Fan Status
                tb.setClickable(false);



                ed =(EditText)findViewById(R.id.DM_765KV_ST_LACOUNTER1); // LA Counter R editText
                ed.setEnabled(false);
                ed =(EditText)findViewById(R.id.DM_765KV_ST_LACOUNTER2); // LA Counter Y editText
                ed.setEnabled(false);
                ed =(EditText)findViewById(R.id.DM_765KV_ST_LACOUNTER3); // LA Counter B editText
                ed.setEnabled(false);

                ed =(EditText)findViewById(R.id.DM_765KV_ST_LA_LEAKAGE_CURRENT_R); // LA Leakage Current R editText
                ed.setEnabled(false);
                ed =(EditText)findViewById(R.id.DM_765KV_ST_LA_LEAKAGE_CURRENT_Y); // LA Leakage Current Y editText
                ed.setEnabled(false);
                ed =(EditText)findViewById(R.id.DM_765KV_ST_LA_LEAKAGE_CURRENT_B); // LA Leakage Current B editText
                ed.setEnabled(false);

                tb = (ToggleButton)findViewById(R.id.DM_765KV_ST_SILICAGEL); // Silica Gel
                tb.setClickable(false);


                ed =(EditText)findViewById(R.id.DM_765KV_ST_TAP_POSITION); // Tap Position editText
                ed.setEnabled(false);
                ed =(EditText)findViewById(R.id.DM_765KV_ST_REMARKS_IF_ANY); // Remarks if Any editText
                ed.setEnabled(false);
                ed =(EditText)findViewById(R.id.DM_765KV_ST_VERIFIED_BY); // Verified By editText
                ed.setEnabled(false);
            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_btn.setVisibility(View.VISIBLE);
                edit_btn.setVisibility(View.GONE);
                confirm_btn.setVisibility(View.GONE);

                RadioGroup rg = (RadioGroup)findViewById(R.id.dm_765KV_st_radiogroup); //To ensure Radiobuttons are clickable
                for(int i=0;i<rg.getChildCount();i++)
                {
                    rg.getChildAt(i).setClickable(true);
                }

                EditText ed =(EditText)findViewById(R.id.DM_765KV_ST_hv_wti); // HV WTI editText
                ed.setEnabled(true);
                ed =(EditText)findViewById(R.id.DM_765KV_ST_lv1_wti); // LV1 WTI editText
                ed.setEnabled(true);
                ed =(EditText)findViewById(R.id.DM_765KV_ST_lv2_wti); // LV2 WTI editText
                ed.setEnabled(true);
                ed =(EditText)findViewById(R.id.DM_765KV_ST_oti); // OTI editText
                ed.setEnabled(true);
                ed =(EditText)findViewById(R.id.DM_765KV_ST_oil_level); // Oil Level in Main Tank editText
                ed.setEnabled(true);
                ed =(EditText)findViewById(R.id.DM_765KV_ST_oil_level_oltc); //Oil Level in OLTC editText
                ed.setEnabled(true);


                ToggleButton tb = (ToggleButton)findViewById(R.id.DM_765_KV_PERSISTING_TRAFO_ALARMS); // Peresisiting TRAFO Alarms
                tb.setClickable(true);
                tb = (ToggleButton)findViewById(R.id.DM_765KV_ST_oil_leakage); // Oil Leakage
                tb.setClickable(true);
                tb = (ToggleButton)findViewById(R.id.DM_765KV_ST_fan_status); // Fan Status
                tb.setClickable(true);



                ed =(EditText)findViewById(R.id.DM_765KV_ST_LACOUNTER1); // LA Counter R editText
                ed.setEnabled(true);
                ed =(EditText)findViewById(R.id.DM_765KV_ST_LACOUNTER2); // LA Counter Y editText
                ed.setEnabled(true);
                ed =(EditText)findViewById(R.id.DM_765KV_ST_LACOUNTER3); // LA Counter B editText
                ed.setEnabled(true);

                ed =(EditText)findViewById(R.id.DM_765KV_ST_LA_LEAKAGE_CURRENT_R); // LA Leakage Current R editText
                ed.setEnabled(true);
                ed =(EditText)findViewById(R.id.DM_765KV_ST_LA_LEAKAGE_CURRENT_Y); // LA Leakage Current Y editText
                ed.setEnabled(true);
                ed =(EditText)findViewById(R.id.DM_765KV_ST_LA_LEAKAGE_CURRENT_B); // LA Leakage Current B editText
                ed.setEnabled(true);

                tb = (ToggleButton)findViewById(R.id.DM_765KV_ST_SILICAGEL); // Silica Gel
                tb.setClickable(true);


                ed =(EditText)findViewById(R.id.DM_765KV_ST_TAP_POSITION); // Tap Position editText
                ed.setEnabled(true);
                ed =(EditText)findViewById(R.id.DM_765KV_ST_REMARKS_IF_ANY); // Remarks if Any editText
                ed.setEnabled(true);
                ed =(EditText)findViewById(R.id.DM_765KV_ST_VERIFIED_BY); // Verified By editText
                ed.setEnabled(true);
            }
        });

        confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder sb = new StringBuilder();
                sb.append("Insert into ");
                sb.append("dm_trafo_yard_st_"); // tablename

                RadioGroup rg = (RadioGroup) findViewById(R.id.dm_765KV_st_radiogroup);  // value from radiogroup
                RadioButton rb = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
                String radioText = (String) rb.getText();
                sb.append(radioText); // add SAT number

                sb.append(" values(");

                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");           // add Date
                String formattedDate = sd.format(new java.util.Date().getTime());
                sb.append("'");
                sb.append(formattedDate); // date
                sb.append("'");
                sb.append(","); // segregating values

                sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  // timestamp
                formattedDate = sd.format(new java.util.Date());
                sb.append("'");
                sb.append(formattedDate); // add timestamp
                sb.append("'");
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_765KV_ST_hv_wti)).getText().toString() );  //Verified By
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_765KV_ST_lv1_wti)).getText().toString() );  //Verified By
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_765KV_ST_lv2_wti)).getText().toString() );  //Verified By
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_765KV_ST_oti)).getText().toString() );  //Verified By
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_765KV_ST_oil_level)).getText().toString() );  //Verified By
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_765KV_ST_oil_level_oltc)).getText().toString() );  //Verified By
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_765_KV_PERSISTING_TRAFO_ALARMS)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_765KV_ST_oil_leakage)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values

                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_765KV_ST_fan_status)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_765KV_ST_LACOUNTER1)).getText().toString() );  //Verified By
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_765KV_ST_LACOUNTER2)).getText().toString() );  //Verified By
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_765KV_ST_LACOUNTER3)).getText().toString() );  //Verified By
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_765KV_ST_LA_LEAKAGE_CURRENT_R)).getText().toString() );  //Verified By
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_765KV_ST_LA_LEAKAGE_CURRENT_Y)).getText().toString() );  //Verified By
                sb.append(","); // segregating values

                sb.append(((EditText)findViewById(R.id.DM_765KV_ST_LA_LEAKAGE_CURRENT_B)).getText().toString() );  //Verified By
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((ToggleButton)findViewById(R.id.DM_765KV_ST_SILICAGEL)).getText().toString() );  //Persisting Alarm Y
                sb.append("'");
                sb.append(","); // segregating values


                sb.append(((EditText)findViewById(R.id.DM_765KV_ST_TAP_POSITION)).getText().toString() );  //Verified By
                sb.append(","); // segregating values



                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_765KV_ST_REMARKS_IF_ANY)).getText().toString() );  //Remarks If Any Y
                sb.append("'");
                sb.append(","); // segregating values


                sb.append("'");
                sb.append(((EditText)findViewById(R.id.DM_765KV_ST_VERIFIED_BY)).getText().toString() );  //Verified By
                sb.append("'");

                sb.append(");"); // Close

                // Send Query


                String query = sb.toString();
                ConnectionClass object = new ConnectionClass();
                object.execute(query);

            }
        });
    }
}
