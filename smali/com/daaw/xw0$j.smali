.class public Lcom/daaw/xw0$j;
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
        "Lcom/daaw/al;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/xw0;


# direct methods
.method public constructor <init>(Lcom/daaw/xw0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/xw0$j;->a:Lcom/daaw/xw0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/al;)V
    .locals 2

    sget-object v0, Lcom/daaw/oz$e;->b:Lcom/daaw/jw1;

    invoke-virtual {p1}, Lcom/daaw/al;->a()Landroid/app/Activity;

    move-result-object p1

    const-string v1, "Select track"

    invoke-virtual {v0, p1, v1}, Lcom/daaw/jw1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/al;

    invoke-virtual {p0, p1}, Lcom/daaw/xw0$j;->a(Lcom/daaw/al;)V

    return-void
.end method
