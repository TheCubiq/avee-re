package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class StreamLocalUriFetcher extends LocalUriFetcher<InputStream> {
    private static final int ID_CONTACT = 3;
    private static final int ID_DISPLAY_PHOTO = 4;
    private static final int ID_LOOKUP = 1;
    private static final int ID_THUMBNAIL = 2;
    private static final UriMatcher URI_MATCHER;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        URI_MATCHER = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        URI_MATCHER.addURI("com.android.contacts", "contacts/lookup/*", 1);
        URI_MATCHER.addURI("com.android.contacts", "contacts/#/photo", 2);
        URI_MATCHER.addURI("com.android.contacts", "contacts/#", 3);
        URI_MATCHER.addURI("com.android.contacts", "contacts/#/display_photo", 4);
    }

    public StreamLocalUriFetcher(Context context, Uri uri) {
        super(context, uri);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.load.data.LocalUriFetcher
    public InputStream loadResource(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        return loadResourceFromUri(uri, contentResolver, URI_MATCHER.match(uri));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.LocalUriFetcher
    public void close(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    private InputStream loadResourceFromUri(Uri uri, ContentResolver contentResolver, int i) throws FileNotFoundException {
        if (i == 1 || i == 3) {
            if (i == 1 && (uri = ContactsContract.Contacts.lookupContact(contentResolver, uri)) == null) {
                throw new FileNotFoundException("Contact cannot be found");
            }
            return openContactPhotoInputStream(contentResolver, uri);
        }
        return contentResolver.openInputStream(uri);
    }

    private InputStream openContactPhotoInputStream(ContentResolver contentResolver, Uri uri) {
        if (Build.VERSION.SDK_INT < 14) {
            return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri);
        }
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }
}
