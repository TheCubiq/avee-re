package com.daaw.avee.comp.Visualizer.Graphic;

import com.daaw.avee.comp.AlbumArt.LocalBitmapLoader;
/* loaded from: classes.dex */
public class CharSet {
    final int count;
    final char first;
    final char last;

    public CharSet(char c, char c2) {
        this.first = c;
        this.last = c2;
        this.count = (c2 - c) + 1;
    }

    public static CharSet createAscii32to126() {
        return new CharSet(' ', '~');
    }

    public static CharSet createAscii48to90() {
        return new CharSet('0', 'Z');
    }

    public static CharSet createAsciiNumbers() {
        return new CharSet('0', '9');
    }

    public static CharSet createAsciiNumbersAnd1() {
        return new CharSet('0', LocalBitmapLoader.Separator);
    }

    public static CharSet createAsciiCapitals() {
        return new CharSet('A', 'Z');
    }

    public int count() {
        return this.count;
    }

    public int getIndexByChar(char c) {
        char c2 = this.first;
        if (c - c2 < this.count && c - c2 >= 0) {
            return c - c2;
        }
        return 0;
    }

    public int tryGetIndexByChar(char c) {
        char c2 = this.first;
        if (c - c2 < this.count && c - c2 >= 0) {
            return c - c2;
        }
        return -1;
    }

    public char getCharByIndex(int i) {
        if (i >= this.count) {
            i = 0;
        }
        return (char) (this.first + i);
    }
}
