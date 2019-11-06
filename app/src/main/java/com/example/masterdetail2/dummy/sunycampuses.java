package com.example.masterdetail2.dummy;

import com.example.masterdetail2.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class sunycampuses {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<campus> ITEMS = new ArrayList<campus>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, campus> ITEM_MAP = new HashMap<String, campus>();

    private static final int COUNT =25;

    static {

        // Add some sample items.

        addItem(new campus("SUCO", "SUNY Oneonta", "A liberal art college", R.drawable.suco, "red dragon", R.drawable.sucom));

        addItem(new campus("Albany", "SUNY Albany", "A research center", R.drawable.albany, "dane", R.drawable.albanym));

        addItem(new campus("Binghamton", "SUNY Binghamton", "A research", R.drawable.suco, "some", R.drawable.sucom));

        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }




    }

    private static void addItem(campus item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static campus createDummyItem(int position) {
        return new campus(String.valueOf(position), "Item " + position, makeDetails(position), R.drawable.suco,"abc", R.drawable.ic_launcher_foreground);
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class campus {
        public final String id;
        public final String content;
        public final String details;
        public final int logoid;
        public final String mascotname;
        public final int mascotid;


        public campus(String id, String content, String details, int logoid, String mascotname, int mascotid) {
            this.id = id;
            this.content = content;
            this.details = details;
            this.logoid=logoid;
            this.mascotname = mascotname;
            this.mascotid=mascotid;
        }

        @Override
        public String toString() {
            return content;
        }

    }
}
