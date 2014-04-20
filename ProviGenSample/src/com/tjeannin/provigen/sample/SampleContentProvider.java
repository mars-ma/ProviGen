package com.tjeannin.provigen.sample;

import android.net.Uri;
import com.tjeannin.provigen.ProviGenBaseContract;
import com.tjeannin.provigen.ProviGenProvider;
import com.tjeannin.provigen.annotation.Column;
import com.tjeannin.provigen.annotation.Column.Type;
import com.tjeannin.provigen.annotation.ContentUri;


public class SampleContentProvider extends ProviGenProvider {

    @Override
    public Class[] contractClasses() {
        return new Class[]{Person.class};
    }

    public static interface Person extends ProviGenBaseContract {

        @Column(Type.INTEGER)
        public static final String AGE = "int";

        @Column(Type.TEXT)
        public static final String NAME = "string";

        @ContentUri
        public static final Uri CONTENT_URI = Uri.parse("content://com.tjeannin.provigen.sample/persons");
    }
}
