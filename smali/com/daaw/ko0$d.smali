.class public Lcom/daaw/ko0$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ko0;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/ko0;


# direct methods
.method public constructor <init>(Lcom/daaw/ko0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ko0$d;->p:Lcom/daaw/ko0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 2

    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/ko0$d;->p:Lcom/daaw/ko0;

    invoke-static {p1}, Lcom/daaw/ko0;->j(Lcom/daaw/ko0;)J

    move-result-wide v0

    iget-object p1, p0, Lcom/daaw/ko0$d;->p:Lcom/daaw/ko0;

    invoke-static {p1, v0, v1}, Lcom/daaw/ko0;->k(Lcom/daaw/ko0;J)V

    :goto_0
    const/4 p1, 0x0

    return p1
.end method
