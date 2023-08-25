.class public abstract Lcom/daaw/zm;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/daaw/lm;Ljava/lang/String;Ljava/io/File;)Lcom/daaw/zm;
    .locals 1

    new-instance v0, Lcom/daaw/f8;

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/f8;-><init>(Lcom/daaw/lm;Ljava/lang/String;Ljava/io/File;)V

    return-object v0
.end method


# virtual methods
.method public abstract b()Lcom/daaw/lm;
.end method

.method public abstract c()Ljava/io/File;
.end method

.method public abstract d()Ljava/lang/String;
.end method
