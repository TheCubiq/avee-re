.class public final synthetic Lcom/daaw/ay3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/jy3;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ay3;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/ay3;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/x84;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/ay3;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/daaw/ay3;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v2

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v1, v0}, Lcom/daaw/x84;->u2(Lcom/daaw/yd0;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
