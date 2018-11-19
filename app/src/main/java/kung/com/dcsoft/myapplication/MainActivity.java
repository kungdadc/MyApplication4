package kung.com.dcsoft.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);  //savedInstanceState ตัวแปรเก็บความคืบหน้าของโปรแกรม เวลาถูก รnterrup จะกลับมาจุดเดิมได้
        // ถ้าเป็นการเปิดครั้งแรก จะมีค่าเป็น null
        setContentView(R.layout.activity_main);

//        add Fragment to Activity
        if (savedInstanceState == null) {

            getSupportFragmentManager().beginTransaction().add(R.id.layoutMainFragment, new MainFragment()).commit();

        }




    }// Main Method
} //Main Class
