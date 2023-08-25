.class public Lcom/daaw/zj$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zj$r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/zj;->g0(ILcom/daaw/sd0;Ljava/io/File;Z)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/daaw/sd0;


# direct methods
.method public constructor <init>(ILcom/daaw/sd0;)V
    .locals 0

    iput p1, p0, Lcom/daaw/zj$h;->a:I

    iput-object p2, p0, Lcom/daaw/zj$h;->b:Lcom/daaw/sd0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/io/File;)Z
    .locals 4

    sget-object v0, Lcom/daaw/yj;->t:Lcom/daaw/yw1;

    iget v1, p0, Lcom/daaw/zj$h;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/zj$h;->b:Lcom/daaw/sd0;

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/daaw/yw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method
