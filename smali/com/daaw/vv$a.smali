.class public Lcom/daaw/vv$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/vv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:I

.field public b:Lcom/daaw/a7;

.field public c:Lcom/daaw/jr1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/jr1<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/vv$a;->a:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/vv$a;->b:Lcom/daaw/a7;

    iput-object v0, p0, Lcom/daaw/vv$a;->c:Lcom/daaw/jr1;

    return-void
.end method
