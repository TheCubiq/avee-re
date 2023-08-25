.class public final Lcom/daaw/mc8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:J

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/ry0;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p3}, Lcom/daaw/ry0;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p6}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/mc8;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/mc8;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/mc8;->c:Ljava/lang/String;

    iput-wide p4, p0, Lcom/daaw/mc8;->d:J

    iput-object p6, p0, Lcom/daaw/mc8;->e:Ljava/lang/Object;

    return-void
.end method
