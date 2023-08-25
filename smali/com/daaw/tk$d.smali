.class public final Lcom/daaw/tk$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/tk$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/tk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field public a:Landroid/content/ClipData;

.field public b:I

.field public c:I

.field public d:Landroid/net/Uri;

.field public e:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Landroid/content/ClipData;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/tk$d;->a:Landroid/content/ClipData;

    iput p2, p0, Lcom/daaw/tk$d;->b:I

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/tk;
    .locals 2

    new-instance v0, Lcom/daaw/tk;

    new-instance v1, Lcom/daaw/tk$g;

    invoke-direct {v1, p0}, Lcom/daaw/tk$g;-><init>(Lcom/daaw/tk$d;)V

    invoke-direct {v0, v1}, Lcom/daaw/tk;-><init>(Lcom/daaw/tk$f;)V

    return-object v0
.end method

.method public b(Landroid/net/Uri;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/tk$d;->d:Landroid/net/Uri;

    return-void
.end method

.method public c(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/tk$d;->c:I

    return-void
.end method

.method public setExtras(Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/tk$d;->e:Landroid/os/Bundle;

    return-void
.end method
