.class public Lcom/daaw/cx0$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/cx0;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/cx0;


# direct methods
.method public constructor <init>(Lcom/daaw/cx0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/cx0$e;->a:Lcom/daaw/cx0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    sget-object v0, Lcom/daaw/avee/comp/playback/c;->f:Lcom/daaw/iw1;

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/iw1;->a(Ljava/lang/Object;)V

    return-void
.end method
