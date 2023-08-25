.class public Lcom/daaw/wd1$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/wd1;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/wd1;


# direct methods
.method public constructor <init>(Lcom/daaw/wd1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/wd1$d;->a:Lcom/daaw/wd1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    sget-object v0, Lcom/daaw/avee/comp/playback/c;->f:Lcom/daaw/iw1;

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/iw1;->a(Ljava/lang/Object;)V

    return-void
.end method
