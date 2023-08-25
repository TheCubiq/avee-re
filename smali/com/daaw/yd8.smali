.class public final synthetic Lcom/daaw/yd8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/c35;


# instance fields
.field public final synthetic a:Lcom/daaw/ib8;

.field public final synthetic b:Lcom/daaw/ar8;

.field public final synthetic c:Lcom/daaw/lr8;

.field public final synthetic d:Ljava/io/IOException;

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ib8;Lcom/daaw/ar8;Lcom/daaw/lr8;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/yd8;->a:Lcom/daaw/ib8;

    iput-object p2, p0, Lcom/daaw/yd8;->b:Lcom/daaw/ar8;

    iput-object p3, p0, Lcom/daaw/yd8;->c:Lcom/daaw/lr8;

    iput-object p4, p0, Lcom/daaw/yd8;->d:Ljava/io/IOException;

    iput-boolean p5, p0, Lcom/daaw/yd8;->e:Z

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 6

    iget-object v1, p0, Lcom/daaw/yd8;->a:Lcom/daaw/ib8;

    iget-object v2, p0, Lcom/daaw/yd8;->b:Lcom/daaw/ar8;

    iget-object v3, p0, Lcom/daaw/yd8;->c:Lcom/daaw/lr8;

    iget-object v4, p0, Lcom/daaw/yd8;->d:Ljava/io/IOException;

    iget-boolean v5, p0, Lcom/daaw/yd8;->e:Z

    move-object v0, p1

    check-cast v0, Lcom/daaw/ob8;

    invoke-interface/range {v0 .. v5}, Lcom/daaw/ob8;->s(Lcom/daaw/ib8;Lcom/daaw/ar8;Lcom/daaw/lr8;Ljava/io/IOException;Z)V

    return-void
.end method
