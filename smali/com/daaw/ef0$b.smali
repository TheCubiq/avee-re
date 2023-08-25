.class public Lcom/daaw/ef0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/jr1$a;


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
        "Lcom/daaw/jr1$a<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ef0;


# direct methods
.method public constructor <init>(Lcom/daaw/ef0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ef0$b;->a:Lcom/daaw/ef0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, Lcom/daaw/ef0$b;->b(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public b(Landroid/graphics/Bitmap;)V
    .locals 0

    return-void
.end method
