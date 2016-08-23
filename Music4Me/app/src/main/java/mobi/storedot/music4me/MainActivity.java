package mobi.storedot.music4me;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Find the view that shows ListArtists category
         */
        TextView ListArtists = (TextView) findViewById(R.id.ListArtists);

        /**
         * Attach the clicklistener to the ListArtists view and create new object instance of the event listener
         */

        ListArtists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /**
                 * Define the event listener inline and the intent to ListArtists class for when the the user clicks on ListArtists view.
                 */
                Intent intent = new Intent(MainActivity.this, ListArtists.class);
                startActivity(intent);
            }
        });

        /**
         * Find the view that shows PlayListNow category
         */
        TextView PlayListNow = (TextView) findViewById(R.id.PlayListNow);

        /**
         * Attach the clicklistener to the PlayListNow view and create new object instance of the event listener
         */

        PlayListNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /**
                 * Define the event listener inline and the intent to PlayListNow class for when the the user clicks on PlayListNow view.
                 */
                Intent intent = new Intent(MainActivity.this, PlayListNow.class);
                startActivity(intent);
            }
        });

        /**
         * Find the view that shows SearchList category
         */
        TextView SearchMyList = (TextView) findViewById(R.id.SearchMyList);

        /**
         * Attach the clicklistener to the SearchList view and create new object instance of the event listener
         */

        SearchMyList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /**
                 * Define the event listener inline and the intent to SearchList class for when the the user clicks on SearchList view.
                 */
                Intent intent = new Intent(MainActivity.this, SearchList.class);
                startActivity(intent);
            }
        });
    }
}
