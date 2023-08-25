.class public Lcom/daaw/qk$h;
.super Lcom/daaw/gh0$j$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/qk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/daaw/qk;


# direct methods
.method public constructor <init>(Lcom/daaw/qk;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qk$h;->b:Lcom/daaw/qk;

    invoke-direct {p0}, Lcom/daaw/gh0$j$a;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/content/Context;Ljava/lang/Object;)Lcom/daaw/gh0$d;
    .locals 0

    check-cast p2, Lcom/daaw/qk$s;

    new-instance p1, Lcom/daaw/gh0$d;

    iget-object p2, p2, Lcom/daaw/qk$s;->b:Lcom/daaw/tx0;

    invoke-direct {p1, p2}, Lcom/daaw/gh0$d;-><init>(Lcom/daaw/tx0;)V

    return-object p1
.end method
