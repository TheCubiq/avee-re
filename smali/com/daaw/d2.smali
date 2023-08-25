.class public final synthetic Lcom/daaw/d2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w40;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lcom/daaw/r60;

.field public final synthetic c:Lcom/daaw/ye0;

.field public final synthetic d:Lcom/daaw/l31;

.field public final synthetic e:Lcom/daaw/l31;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lcom/daaw/r60;Lcom/daaw/ye0;Lcom/daaw/l31;Lcom/daaw/l31;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/d2;->a:Ljava/lang/Object;

    iput-object p2, p0, Lcom/daaw/d2;->b:Lcom/daaw/r60;

    iput-object p3, p0, Lcom/daaw/d2;->c:Lcom/daaw/ye0;

    iput-object p4, p0, Lcom/daaw/d2;->d:Lcom/daaw/l31;

    iput-object p5, p0, Lcom/daaw/d2;->e:Lcom/daaw/l31;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/daaw/d2;->a:Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/d2;->b:Lcom/daaw/r60;

    iget-object v2, p0, Lcom/daaw/d2;->c:Lcom/daaw/ye0;

    iget-object v3, p0, Lcom/daaw/d2;->d:Lcom/daaw/l31;

    iget-object v4, p0, Lcom/daaw/d2;->e:Lcom/daaw/l31;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/daaw/g2;->b(Ljava/lang/Object;Lcom/daaw/r60;Lcom/daaw/ye0;Lcom/daaw/l31;Lcom/daaw/l31;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method
