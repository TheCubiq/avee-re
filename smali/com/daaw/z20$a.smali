.class public Lcom/daaw/z20$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/z20;->e(Landroid/content/Context;Lcom/daaw/x20;Lcom/daaw/ld;II)Landroid/graphics/Typeface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lcom/daaw/z20$e;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lcom/daaw/x20;

.field public final synthetic d:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;Lcom/daaw/x20;I)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/z20$a;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/z20$a;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/daaw/z20$a;->c:Lcom/daaw/x20;

    iput p4, p0, Lcom/daaw/z20$a;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/z20$e;
    .locals 4

    iget-object v0, p0, Lcom/daaw/z20$a;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/daaw/z20$a;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/daaw/z20$a;->c:Lcom/daaw/x20;

    iget v3, p0, Lcom/daaw/z20$a;->d:I

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/z20;->c(Ljava/lang/String;Landroid/content/Context;Lcom/daaw/x20;I)Lcom/daaw/z20$e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/z20$a;->a()Lcom/daaw/z20$e;

    move-result-object v0

    return-object v0
.end method
