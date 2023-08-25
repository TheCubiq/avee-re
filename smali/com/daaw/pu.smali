.class public Lcom/daaw/pu;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/g70;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/pu$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroid/graphics/drawable/Drawable;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/g70<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/vs1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vs1<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:I

.field public c:Lcom/daaw/qu;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/qu<",
            "TT;>;"
        }
    .end annotation
.end field

.field public d:Lcom/daaw/qu;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/qu<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x12c

    invoke-direct {p0, v0}, Lcom/daaw/pu;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    new-instance v0, Lcom/daaw/vs1;

    new-instance v1, Lcom/daaw/pu$a;

    invoke-direct {v1, p1}, Lcom/daaw/pu$a;-><init>(I)V

    invoke-direct {v0, v1}, Lcom/daaw/vs1;-><init>(Lcom/daaw/us1$a;)V

    invoke-direct {p0, v0, p1}, Lcom/daaw/pu;-><init>(Lcom/daaw/vs1;I)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/vs1;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/vs1<",
            "TT;>;I)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/pu;->a:Lcom/daaw/vs1;

    iput p2, p0, Lcom/daaw/pu;->b:I

    return-void
.end method


# virtual methods
.method public a(ZZ)Lcom/daaw/f70;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ)",
            "Lcom/daaw/f70<",
            "TT;>;"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/daaw/vs0;->c()Lcom/daaw/f70;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lcom/daaw/pu;->b()Lcom/daaw/f70;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/pu;->c()Lcom/daaw/f70;

    move-result-object p1

    return-object p1
.end method

.method public final b()Lcom/daaw/f70;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/f70<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/pu;->c:Lcom/daaw/qu;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/pu;->a:Lcom/daaw/vs1;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/vs1;->a(ZZ)Lcom/daaw/f70;

    move-result-object v0

    new-instance v1, Lcom/daaw/qu;

    iget v2, p0, Lcom/daaw/pu;->b:I

    invoke-direct {v1, v0, v2}, Lcom/daaw/qu;-><init>(Lcom/daaw/f70;I)V

    iput-object v1, p0, Lcom/daaw/pu;->c:Lcom/daaw/qu;

    :cond_0
    iget-object v0, p0, Lcom/daaw/pu;->c:Lcom/daaw/qu;

    return-object v0
.end method

.method public final c()Lcom/daaw/f70;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/f70<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/pu;->d:Lcom/daaw/qu;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/pu;->a:Lcom/daaw/vs1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Lcom/daaw/vs1;->a(ZZ)Lcom/daaw/f70;

    move-result-object v0

    new-instance v1, Lcom/daaw/qu;

    iget v2, p0, Lcom/daaw/pu;->b:I

    invoke-direct {v1, v0, v2}, Lcom/daaw/qu;-><init>(Lcom/daaw/f70;I)V

    iput-object v1, p0, Lcom/daaw/pu;->d:Lcom/daaw/qu;

    :cond_0
    iget-object v0, p0, Lcom/daaw/pu;->d:Lcom/daaw/qu;

    return-object v0
.end method
