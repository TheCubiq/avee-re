.class public Lcom/daaw/ef0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/jr1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ef0;->e()Lcom/daaw/jr1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/jr1$b<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ef0;


# direct methods
.method public constructor <init>(Lcom/daaw/ef0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ef0$a;->a:Lcom/daaw/ef0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/ef0$a;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public b()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ef0$a;->a:Lcom/daaw/ef0;

    invoke-static {v0}, Lcom/daaw/ef0;->i(Lcom/daaw/ef0;)Lcom/daaw/w40;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/w40;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0
.end method
