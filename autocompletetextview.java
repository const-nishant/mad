import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView autoComplete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoComplete = findViewById(R.id.autoComplete);

        String[] languages = {"Java", "Kotlin", "Python", "C++", "C#", "JavaScript"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
            android.R.layout.simple_dropdown_item_1line, languages);

        autoComplete.setAdapter(adapter);
        autoComplete.setThreshold(1);

        autoComplete.setOnItemClickListener((parent, view, position, id) -> {
            String selected = adapter.getItem(position);
            Toast.makeText(this, "Selected: " + selected, Toast.LENGTH_SHORT).show();
        });
    }
}
