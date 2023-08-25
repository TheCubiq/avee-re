.class public Lcom/daaw/xw0$e0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/xw0;-><init>(Lcom/daaw/uf1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/qw1$a<",
        "Landroid/app/Activity;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/xw0;


# direct methods
.method public constructor <init>(Lcom/daaw/xw0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/xw0$e0;->a:Lcom/daaw/xw0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;)V
    .locals 1

    const/4 p1, 0x0

    sput-boolean p1, Lcom/daaw/xw0;->m:Z

    sget-object p1, Lcom/daaw/avee/comp/playback/c;->g:Lcom/daaw/hw1;

    invoke-virtual {p1}, Lcom/daaw/hw1;->a()V

    sget-object p1, Lcom/daaw/avee/comp/playback/c;->h:Lcom/daaw/iw1;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lcom/daaw/iw1;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p0, p1}, Lcom/daaw/xw0$e0;->a(Landroid/app/Activity;)V

    return-void
.end method
