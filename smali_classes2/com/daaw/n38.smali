.class public final Lcom/daaw/n38;
.super Lcom/daaw/pa8;
.source ""


# direct methods
.method public constructor <init>(Lcom/daaw/yb8;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/pa8;-><init>(Lcom/daaw/yb8;)V

    return-void
.end method

.method public static final c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    new-instance p0, Ljava/lang/SecurityException;

    const-string p1, "This implementation should not be used."

    invoke-direct {p0, p1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final k()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
