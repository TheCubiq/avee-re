.class public abstract Lcom/daaw/iw0;
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

.method public static a(JLcom/daaw/sn1;Lcom/daaw/by;)Lcom/daaw/iw0;
    .locals 1

    new-instance v0, Lcom/daaw/l9;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/daaw/l9;-><init>(JLcom/daaw/sn1;Lcom/daaw/by;)V

    return-object v0
.end method


# virtual methods
.method public abstract b()Lcom/daaw/by;
.end method

.method public abstract c()J
.end method

.method public abstract d()Lcom/daaw/sn1;
.end method
