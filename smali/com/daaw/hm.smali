.class public final synthetic Lcom/daaw/hm;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/es$a;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J

.field public final synthetic d:Lcom/daaw/of1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;JLcom/daaw/of1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/hm;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/hm;->b:Ljava/lang/String;

    iput-wide p3, p0, Lcom/daaw/hm;->c:J

    iput-object p5, p0, Lcom/daaw/hm;->d:Lcom/daaw/of1;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/b01;)V
    .locals 6

    iget-object v0, p0, Lcom/daaw/hm;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/daaw/hm;->b:Ljava/lang/String;

    iget-wide v2, p0, Lcom/daaw/hm;->c:J

    iget-object v4, p0, Lcom/daaw/hm;->d:Lcom/daaw/of1;

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/daaw/im;->f(Ljava/lang/String;Ljava/lang/String;JLcom/daaw/of1;Lcom/daaw/b01;)V

    return-void
.end method
