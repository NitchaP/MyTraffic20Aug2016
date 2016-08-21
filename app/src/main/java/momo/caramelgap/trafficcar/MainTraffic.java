package momo.caramelgap.trafficcar;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import static momo.caramelgap.trafficcar.R.id.button;

public class MainTraffic extends AppCompatActivity {

      // Explicit การประกาศตัวแปร
    private ListView trafficListView;
    private Button abountMeButton;
    private static final String urlYouTube = "https://youtu.be/Tf-hD_DFeyU";
    //static  ค่าคงที่  final เปลี่ยนแปลงไม่ได้  String =Object Java

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // This's Statement
        setContentView(R.layout.activity_main_traffic);

        //Bind Widget ผูกความสัมพันธ์กับตัวแปร และ Widget
        trafficListView = (ListView) findViewById(R.id.listView);

        // เป็นตัวแดง Alt+Enter (Button) fi  เลือกอันแรก พวกรูปภาพ เสียง
        //Ctrl+Shift+Enter = ปิดท้าย
        abountMeButton = (Button) findViewById(R.id.button);

        //Get Event from Click Button'
        abountMeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                //ใส่เสียง mp3 wav ชื่อพิมเล็กเท่านั้น Sound Effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.effect_btn_long);
                mediaPlayer.start();

                //Intent to WebView https://youtu.be/Tf-hD_DFeyU
                    //Intent = ประกาศ class I ใหญ่ intent = new Intent(Intent.ACV
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    // Uri คือเรียกใช้
                    intent.setData(Uri.parse(urlYouTube));
                    startActivity(intent);

            }   // onclick
        });



    }   //Main Method
}   //Main class
