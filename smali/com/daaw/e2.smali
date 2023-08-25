.class public final synthetic Lcom/daaw/e2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ir1$b;


# instance fields
.field public final synthetic a:Lcom/daaw/af0;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/daaw/ye0;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/af0;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/ye0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/e2;->a:Lcom/daaw/af0;

    iput-object p2, p0, Lcom/daaw/e2;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/e2;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/e2;->d:Lcom/daaw/ye0;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Z)V
    .locals 6

    iget-object v0, p0, Lcom/daaw/e2;->a:Lcom/daaw/af0;

    iget-object v1, p0, Lcom/daaw/e2;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/e2;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/daaw/e2;->d:Lcom/daaw/ye0;

    move-object v4, p1

    check-cast v4, Lcom/daaw/l70;

    move v5, p2

    invoke-static/range {v0 .. v5}, Lcom/daaw/g2;->e(Lcom/daaw/af0;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/ye0;Lcom/daaw/l70;Z)V

    return-void
.end method
