.class public final Lcom/daaw/x2$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/x2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:J

.field public final b:Lcom/daaw/nl1;

.field public final c:I

.field public final d:Lcom/daaw/bp0$a;

.field public final e:J

.field public final f:J

.field public final g:J


# direct methods
.method public constructor <init>(JLcom/daaw/nl1;ILcom/daaw/bp0$a;JJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/daaw/x2$a;->a:J

    iput-object p3, p0, Lcom/daaw/x2$a;->b:Lcom/daaw/nl1;

    iput p4, p0, Lcom/daaw/x2$a;->c:I

    iput-object p5, p0, Lcom/daaw/x2$a;->d:Lcom/daaw/bp0$a;

    iput-wide p6, p0, Lcom/daaw/x2$a;->e:J

    iput-wide p8, p0, Lcom/daaw/x2$a;->f:J

    iput-wide p10, p0, Lcom/daaw/x2$a;->g:J

    return-void
.end method
