.class public Lcom/daaw/c60$j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qw1$a;


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
        "Lcom/daaw/qw1$a<",
        "Landroid/app/Activity;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/c60;


# direct methods
.method public constructor <init>(Lcom/daaw/c60;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/c60$j;->a:Lcom/daaw/c60;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/c60$j;->a:Lcom/daaw/c60;

    invoke-static {v0, p1}, Lcom/daaw/c60;->d(Lcom/daaw/c60;Landroid/app/Activity;)V

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p0, p1}, Lcom/daaw/c60$j;->a(Landroid/app/Activity;)V

    return-void
.end method
