.class public Landroidx/room/d$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/room/d$a;->s0([Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:[Ljava/lang/String;

.field public final synthetic q:Landroidx/room/d$a;


# direct methods
.method public constructor <init>(Landroidx/room/d$a;[Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Landroidx/room/d$a$a;->q:Landroidx/room/d$a;

    iput-object p2, p0, Landroidx/room/d$a$a;->p:[Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Landroidx/room/d$a$a;->q:Landroidx/room/d$a;

    iget-object v0, v0, Landroidx/room/d$a;->p:Landroidx/room/d;

    iget-object v0, v0, Landroidx/room/d;->d:Landroidx/room/c;

    iget-object v1, p0, Landroidx/room/d$a$a;->p:[Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroidx/room/c;->e([Ljava/lang/String;)V

    return-void
.end method
