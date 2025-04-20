import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    Button timeBtn, dateBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timeBtn = findViewById(R.id.timeBtn);
        dateBtn = findViewById(R.id.dateBtn);

        // Time Picker
        timeBtn.setOnClickListener(v -> {
            Calendar c = Calendar.getInstance();
            int hour = c.get(Calendar.HOUR_OF_DAY);
            int minute = c.get(Calendar.MINUTE);

            new TimePickerDialog(this, (view, hourOfDay, min) -> 
                Toast.makeText(this, "Selected Time: " + hourOfDay + ":" + min, Toast.LENGTH_SHORT).show(),
                hour, minute, true
            ).show();
        });

        // Date Picker
        dateBtn.setOnClickListener(v -> {
            Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            new DatePickerDialog(this, (view, y, m, d) -> 
                Toast.makeText(this, "Selected Date: " + d + "/" + (m + 1) + "/" + y, Toast.LENGTH_SHORT).show(),
                year, month, day
            ).show();
        });
    }
}
