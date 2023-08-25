package com.daaw;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class qg1 extends qk0<InputStream> {
    public static final UriMatcher d;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        d = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
    }

    public qg1(Context context, Uri uri) {
        super(context, uri);
    }

    @Override // com.daaw.qk0
    /* renamed from: e */
    public void c(InputStream inputStream) {
        inputStream.close();
    }

    @Override // com.daaw.qk0
    /* renamed from: f */
    public InputStream d(Uri uri, ContentResolver contentResolver) {
        return g(uri, contentResolver, d.match(uri));
    }

    public final InputStream g(Uri uri, ContentResolver contentResolver, int i) {
        if (i == 1 || i == 3) {
            if (i == 1 && (uri = ContactsContract.Contacts.lookupContact(contentResolver, uri)) == null) {
                throw new FileNotFoundException("Contact cannot be found");
            }
            return h(contentResolver, uri);
        }
        return contentResolver.openInputStream(uri);
    }

    @TargetApi(14)
    public final InputStream h(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }
}
