.class public final Lcom/daaw/kd1;
.super Lcom/daaw/yh1;
.source ""


# instance fields
.field public final u:Lcom/daaw/jd1;


# direct methods
.method public constructor <init>(Lcom/daaw/jd1;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/yh1;-><init>()V

    iput-object p1, p0, Lcom/daaw/kd1;->u:Lcom/daaw/jd1;

    return-void
.end method


# virtual methods
.method public final m()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/kd1;->u:Lcom/daaw/jd1;

    invoke-virtual {v0, p0}, Lcom/daaw/jd1;->B(Lcom/daaw/yh1;)V

    return-void
.end method
