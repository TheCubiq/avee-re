.class public abstract Lcom/daaw/fh0$c$a;
.super Lcom/daaw/l0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/fh0$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/daaw/fh0$c;->i()Lcom/daaw/ch0;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/daaw/l0;-><init>(Lcom/daaw/ch0;)V

    return-void
.end method
