.class public Lcom/daaw/ly1$b;
.super Lcom/daaw/mc1;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ly1;-><init>(Lcom/daaw/b61;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic d:Lcom/daaw/ly1;


# direct methods
.method public constructor <init>(Lcom/daaw/ly1;Lcom/daaw/b61;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ly1$b;->d:Lcom/daaw/ly1;

    invoke-direct {p0, p2}, Lcom/daaw/mc1;-><init>(Lcom/daaw/b61;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE from WorkProgress where work_spec_id=?"

    return-object v0
.end method
