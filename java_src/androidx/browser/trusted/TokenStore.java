package androidx.browser.trusted;
/* loaded from: classes.dex */
public interface TokenStore {
    Token load();

    void store(Token token);
}
