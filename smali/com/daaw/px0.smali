.class public final synthetic Lcom/daaw/px0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/g0;


# instance fields
.field public final synthetic a:Lcom/daaw/ox0$b;

.field public final synthetic b:Lcom/daaw/lo1;

.field public final synthetic c:Z

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ox0$b;Lcom/daaw/lo1;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/px0;->a:Lcom/daaw/ox0$b;

    iput-object p2, p0, Lcom/daaw/px0;->b:Lcom/daaw/lo1;

    iput-boolean p3, p0, Lcom/daaw/px0;->c:Z

    iput-boolean p4, p0, Lcom/daaw/px0;->d:Z

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 7

    iget-object v0, p0, Lcom/daaw/px0;->a:Lcom/daaw/ox0$b;

    iget-object v1, p0, Lcom/daaw/px0;->b:Lcom/daaw/lo1;

    iget-boolean v2, p0, Lcom/daaw/px0;->c:Z

    iget-boolean v3, p0, Lcom/daaw/px0;->d:Z

    move-object v4, p1

    check-cast v4, [J

    move-object v5, p2

    check-cast v5, Ljava/util/ArrayList;

    move-object v6, p3

    check-cast v6, Ljava/util/ArrayList;

    invoke-static/range {v0 .. v6}, Lcom/daaw/ox0$b;->a(Lcom/daaw/ox0$b;Lcom/daaw/lo1;ZZ[JLjava/util/ArrayList;Ljava/util/ArrayList;)V

    return-void
.end method
