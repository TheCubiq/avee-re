.class public Lcom/daaw/gd;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lcom/daaw/cy0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/cy0<",
            "Lcom/daaw/i6;",
            ">;"
        }
    .end annotation
.end field

.field public b:Lcom/daaw/cy0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/cy0<",
            "Lcom/daaw/i6;",
            ">;"
        }
    .end annotation
.end field

.field public c:Lcom/daaw/cy0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/cy0<",
            "Lcom/daaw/de1;",
            ">;"
        }
    .end annotation
.end field

.field public d:[Lcom/daaw/de1;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/ey0;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, Lcom/daaw/ey0;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/gd;->a:Lcom/daaw/cy0;

    new-instance v0, Lcom/daaw/ey0;

    invoke-direct {v0, v1}, Lcom/daaw/ey0;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/gd;->b:Lcom/daaw/cy0;

    new-instance v0, Lcom/daaw/ey0;

    invoke-direct {v0, v1}, Lcom/daaw/ey0;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/gd;->c:Lcom/daaw/cy0;

    const/16 v0, 0x20

    new-array v0, v0, [Lcom/daaw/de1;

    iput-object v0, p0, Lcom/daaw/gd;->d:[Lcom/daaw/de1;

    return-void
.end method
