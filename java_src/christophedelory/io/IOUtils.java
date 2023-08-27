package christophedelory.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
/* loaded from: classes.dex */
public final class IOUtils {
    public static String toString(InputStream inputStream, String str) throws IOException {
        InputStreamReader inputStreamReader;
        if (str == null) {
            inputStreamReader = new InputStreamReader(inputStream);
        } else {
            inputStreamReader = new InputStreamReader(inputStream, str);
        }
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[512];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (-1 != read) {
                stringWriter.write(cArr, 0, read);
            } else {
                return stringWriter.toString();
            }
        }
    }

    private IOUtils() {
    }
}
