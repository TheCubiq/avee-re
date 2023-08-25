.class public Lcom/daaw/p61;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ki1$c;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/io/File;

.field public final c:Lcom/daaw/ki1$c;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/io/File;Lcom/daaw/ki1$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/p61;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/p61;->b:Ljava/io/File;

    iput-object p3, p0, Lcom/daaw/p61;->c:Lcom/daaw/ki1$c;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/ki1$b;)Lcom/daaw/ki1;
    .locals 7

    new-instance v6, Lcom/daaw/o61;

    iget-object v1, p1, Lcom/daaw/ki1$b;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/daaw/p61;->a:Ljava/lang/String;

    iget-object v3, p0, Lcom/daaw/p61;->b:Ljava/io/File;

    iget-object v0, p1, Lcom/daaw/ki1$b;->c:Lcom/daaw/ki1$a;

    iget v4, v0, Lcom/daaw/ki1$a;->a:I

    iget-object v0, p0, Lcom/daaw/p61;->c:Lcom/daaw/ki1$c;

    invoke-interface {v0, p1}, Lcom/daaw/ki1$c;->a(Lcom/daaw/ki1$b;)Lcom/daaw/ki1;

    move-result-object v5

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/daaw/o61;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;ILcom/daaw/ki1;)V

    return-object v6
.end method
