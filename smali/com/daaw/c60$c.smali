.class public Lcom/daaw/c60$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/rw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/c60;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/rw1$a<",
        "Landroid/app/Activity;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/c60;


# direct methods
.method public constructor <init>(Lcom/daaw/c60;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/c60$c;->a:Lcom/daaw/c60;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;Ljava/lang/Integer;)V
    .locals 2

    sget-object v0, Lcom/daaw/avee/comp/playback/c;->u:Lcom/daaw/hw1;

    invoke-virtual {v0}, Lcom/daaw/hw1;->a()V

    sget-boolean v0, Lcom/daaw/c60;->j:Z

    sput-boolean v0, Lcom/daaw/c60;->k:Z

    sput-boolean v0, Lcom/daaw/c60;->l:Z

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget v1, Lcom/daaw/i5;->a:I

    if-eq v0, v1, :cond_0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    sget v0, Lcom/daaw/i5;->d:I

    if-ne p2, v0, :cond_1

    :cond_0
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x17

    if-lt p2, v0, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->recreate()V

    :cond_1
    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/app/Activity;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/c60$c;->a(Landroid/app/Activity;Ljava/lang/Integer;)V

    return-void
.end method
